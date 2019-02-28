define(["moment"],function(moment){
	//检索按钮
	var searchButtonClick = function(evt) {
		$("#tblResult").bootstrapTable('destroy');
		$("#tblResult").bootstrapTable({
			url:baseUrl+"/logic/baseInfo/sysDict/find",
			method:'post',
			pagination:true,
			singleSelect:true,
			clickToSelect:true,
			contentType:"application/x-www-form-urlencoded",
			queryParams:function(param){
				return	{
					'display':$('#tbxDisplay').val(),
					'typeCode':$('#selDictType').val()
				};
			},
			columns:[
				{field:'value',halign:'center'},
				{field:'display',halign:'center'},
				{field:'typeCode',halign:'center'},
				{field:'desc',halign:'center'}
			]
		});
	};
	
	return {
		searchButtonClick : searchButtonClick
	};
});