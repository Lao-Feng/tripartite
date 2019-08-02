/**
 * Created by Administrator on 2017/9/12.
 */
$(function(){
    var myChart = echarts.init($("#container7")[0]);
    var option = {
        tooltip : {
            trigger: 'axis',
            axisPointer : {            // 坐标轴指示器，坐标轴触发有效
                type : 'shadow'        // 默认为直线，可选为：'line' | 'shadow'
            }
        },
        legend: {
            data:[]
        },
        //toolbox: {
        //    show : true,
        //    //orient: 'vertical',
        //    x: 'right',
        //    y: 'top',
        //    feature : {
        //        mark : {show: true},
        //        dataView : {show: true, readOnly: false},
        //        magicType : {show: true, type: ['line', 'bar', 'stack', 'tiled']},
        //        restore : {show: true},
        //        saveAsImage : {show: true}
        //    }
        //},
        calculable : true,
        xAxis : [
            {
                type : 'category',
                data:['张杰','李明','赵劲松','陈雪','张家强','李欢','陈华','赵云','陈珊','吴佳琪'],
                rotate:40,interval:0
            }
        ],
        yAxis : [
            {
                type : 'value'
            }
        ],
        series : [
            {
                name:'人员工作量',
                type:'bar',
                barWidth:'30',
                data:[3419,3259, 2125, 3445, 4257,3419,3259, 2125, 3445, 4257],
                itemStyle: {
                    normal: {
                        color:"#269fec"
                    }
                }

            }
        ]
    };
    myChart.setOption(option);
});



