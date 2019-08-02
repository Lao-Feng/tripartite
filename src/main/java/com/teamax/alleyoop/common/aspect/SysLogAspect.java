package com.teamax.alleyoop.common.aspect;

import com.google.gson.Gson;
import com.teamax.alleyoop.common.annotation.SysLogAnnotation;
import com.teamax.alleyoop.common.shiro.ShiroUser;
import com.teamax.alleyoop.common.util.HttpContextUtils;
import com.teamax.alleyoop.common.util.IPUtils;
import com.teamax.alleyoop.dao.SysLogMapper;
import com.teamax.alleyoop.entity.SysLog;
import org.apache.shiro.SecurityUtils;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import java.lang.reflect.Method;
import java.util.Date;


/**
 * 系统日志，切面处理类
 * 
 */
@Aspect
@Component
public class SysLogAspect {
	@Autowired
	private SysLogMapper sysLogMapper;

	public void saveSysLog(JoinPoint joinPoint) {
		MethodSignature signature = (MethodSignature) joinPoint.getSignature();
		Method method = signature.getMethod();
		SysLog sysLog = new SysLog();
		SysLogAnnotation syslog = method.getAnnotation(SysLogAnnotation.class);
		if(syslog != null){
			//注解上的描述
			sysLog.setType(new Byte(syslog.type()));
			sysLog.setOperation(syslog.value());
		}
		//请求的方法名
		String className = joinPoint.getTarget().getClass().getName();
		String methodName = signature.getName();
		sysLog.setInterface_name(className + "." + methodName + "()");
		//请求的参数
		Object[] args = joinPoint.getArgs();
		if(args != null){
			String params = new Gson().toJson(args);
			//String params = JSONObject.fromObject(args[0]).toString();
			if(params.length() > 400){
				params = params.substring(0,400);
			}
			sysLog.setParams(params);
		}
		//获取request
		HttpServletRequest request = HttpContextUtils.getHttpServletRequest();
		//设置IP地址
		sysLog.setServer_ip(IPUtils.getIpAddr(request));
		//用户名
		ShiroUser user = (ShiroUser) SecurityUtils.getSubject().getPrincipal();
		if(user != null){
			String username = user.getLoginName();
			sysLog.setUser(username);
		}
		sysLog.setCreate_time(new Date());
		//保存系统日志
		sysLogMapper.insertSelective(sysLog);
	}

	public void afterThrowingMethod(JoinPoint joinPoint, Exception ex){
		MethodSignature signature = (MethodSignature) joinPoint.getSignature();
		Method method = signature.getMethod();
		SysLog sysLog = new SysLog();
		SysLogAnnotation syslog = method.getAnnotation(SysLogAnnotation.class);
		if(syslog != null){
			//注解上的描述
			sysLog.setType(new Byte("2"));
			String exception = ex.getClass().getName()+":"+ex.getMessage();
			if(exception.length() > 900){
				exception = exception.substring(0,900);
			}
			sysLog.setException(exception);
			sysLog.setOperation(syslog.value());
		}
		//请求的方法名
		String className = joinPoint.getTarget().getClass().getName();
		String methodName = signature.getName();
		sysLog.setInterface_name(className + "." + methodName + "()");
		//请求的参数
		Object[] args = joinPoint.getArgs();
		if(args != null && args.length > 0){
			String params = new Gson().toJson(args[0]);
			//String params = JSONObject.fromObject(args[0]).toString();
			sysLog.setParams(params);
		}
		//获取request
		HttpServletRequest request = HttpContextUtils.getHttpServletRequest();
		//设置IP地址
		sysLog.setServer_ip(IPUtils.getIpAddr(request));
		//用户名
		ShiroUser user = (ShiroUser) SecurityUtils.getSubject().getPrincipal();
		if(user != null){
			String username = user.getLoginName();
			sysLog.setUser(username);
		}
		sysLog.setCreate_time(new Date());
		//保存系统日志
		sysLogMapper.insertSelective(sysLog);
	}

}
