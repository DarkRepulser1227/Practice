define(["moment"],function(moment) {
	
	// 检索按钮
	var searchButtonClick = function(evt) {
		$("#tblResult").bootstrapTable('destroy');
		$("#tblResult").bootstrapTable({
			url:baseUrl + "/logic/baseInfo/category/find",
			method:'post',
			pagination: true,
			singleSelect: true,
			clickToSelect: true,
			contentType: "application/x-www-form-urlencoded",
			queryParams:function(param) {
				return {
					'nameCn':$('#tbxNamecn').val(),
					'parentId':$('#selParent').val()
				};
			},
			columns: [
				{field:'code',title:"<span class='glyphicon glyphicon-tags' /> 分类编码", halign:'center'},
				{field:'nameCn', title:"分类名称", halign:'center'},
				{field:'parentId', title:"上级分类", halign:'center'},
				{field:'comment', title:"备注信息", halign:'center'}
			]
		});
	};
	
	
	// 对外开放的函数列表
	return {
		searchButtonClick : searchButtonClick
	};
});
