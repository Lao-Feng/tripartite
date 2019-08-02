/**
 * 根据状态获取订单列表
 * @param status
 */
function loadOrderList(status){
    $('#table').bootstrapTable({
        method: "post",
        striped: false,
        singleSelect: false,
        url: "/order/list.shtm",
        dataType: "json",
        pagination: true, //分页
        pageSize: 10,
        pageNumber: 1,
        search: false, //显示搜索框
        contentType: "application/x-www-form-urlencoded",
        sidePagination: "server", //服务端请求
        clickToSelect : true, //是否启用点击选中行
        queryParams:function(params) {
            return {
                pageNum: params.offset/params.limit+1,
                pageSize: params.limit,//页码大小
                progresses:status,
                orderCode:$("#orderCode").val()
            };
        },
        responseHandler: function(res) {
            return {
                "total": res.data.total,//总页数
                "rows": res.data.list   //数据
            };
        },
        onDblClickRow: function (row) {
            //openOrderDetail(row.orderCode);
        },
        columns: [
            {
                checkbox: "true",
                field: 'check',
                align: 'center'
            },
            {
                title: "订单编码",
                field: 'orderCode',
                align: 'center'
            },
            {
                title: "订单类型",
                field: 'orderType',
                align: 'center',
                formatter:function (val,row) {
                    if(val=="buy"){return '购买';}
                    else{ return '出售';}
                }
            },
            {
                title: "商品名称",
                field: 'commodity.commodityName',
                align: 'center'
            },
            {
                title: "出售人",
                field: 'offer.firstName',
                align: 'center'
            },
            {
                title: "购买人",
                field: 'purchaser.firstName',
                align: 'center'
            },
            {
                title: '商品价格',
                field: 'commondityPrice',
                align: 'center'
            },
            {
                title: '下单时间',
                field: 'orderTime',
                align: 'center'
            },
            {
                title: "状态",
                field: 'progress',
                align: 'center',
                formatter:function (val,row) {
                    if(val==0){return '待确认';}
                    else if(val==1){return '已确认';}
                    else if(val==2){return '卖家备货';}
                    else if(val==3){return '卖家发货到平台';}
                    else if(val==4){return '平台已收货';}
                    else if(val==5){return '平台已验货';}
                    else if(val==6){return '平台发货到买家';}
                    else if(val==7){return '买家收货';}
                    else if(val==8){return '订单完成';}
                    else if(val==-2){return '买家退货到平台';}
                    else if(val==-1){return '平台退货到卖家';}
                }
            },
            {
                title: '操作',
                field: 'orderCode',
                width: '180px',
                align: 'center',
                formatter:function(val,row){
                    var a='<a href="javascript:void(0)" class="btn btn-xs btn-primary" onclick="openOrderDetail('+row.orderCode+');">订单详情</a>';
                    return a;
                }
            }
        ]
    });
}

/**
 * 查看订单详情
 * @param orderCode
 */
function openOrderDetail(orderCode){
    parent.layer.open({
        type: 2,
        title: "订单详情",
        shade: 0.5,
        skin: 'layui-layer-rim',
        closeBtn:1,
        area: ['1200px', '580px'],
        content: '/page/orders/order-detail.shtm?orderId='+orderCode
    });
}