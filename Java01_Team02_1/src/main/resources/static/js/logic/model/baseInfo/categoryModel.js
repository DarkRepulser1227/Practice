/**
 * 
 */
// 加载页面依赖模块
require(["jquery", "moment" , "bootstrapTable", "bootstrapTableZhCN", "bootstrapSelect",
		 "logic/model/baseInfo/categoryInitModel",
		 "logic/model/baseInfo/categoryEventModel"], function($, moment, table, zhcn, bSelect, pageInit, pageEvent){
	
	// 设置页面全局日期格式
	moment.locale("zh-cn");
	
	// 页面加载
	$(document).ready(function() {

		// 初始化页面显示效果
		pageInit.initPageStyle();

		// 初始化页面数据（例如加载下拉列表）
		pageInit.initData();
				
		// 按钮事件绑定
		$("#btnSearch").click(pageEvent.searchButtonClick);
		
	});

});