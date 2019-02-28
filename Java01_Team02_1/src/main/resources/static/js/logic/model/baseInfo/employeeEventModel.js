/*
*检索按钮的功能实现
*/

define(["moment"],function(moment){
	//检索按钮
	var searchButtonClick = function(evt) {
		$("#tblResult").bootstrapTable('destroy');
		$("#tblResult").bootstrapTable({
			url:baseUrl+"/logic/baseInfo/employee/find",
			method:'post',
			pagination:true,
			singleSelect:true,
			clickToSelect:true,
			contentType:"application/x-www-form-urlencoded",
			queryParams:function(param){
				return	{
					'namecn':$('#tbxNamecn').val(),
					'dept':$('#selDept').val()
				};
			},
			columns:[
				{field:'empNo',halign:'center'},
				{field:'namecn',halign:'center'},
				{field:'dept',halign:'center'},
				{field:'reportToName',halign:'center'}
			]
		});
	};
	
	return {
		searchButtonClick : searchButtonClick
	};
});