/*
*检索按钮的功能实现
*/

define(["moment"],function(moment){
	//检索按钮
	var searchButtonClick = function(evt) {
		$("#tblResult").bootstrapTable('destroy');
		$("#tblResult").bootstrapTable({
			url:baseUrl+"/logic/baseInfo/sysUser/find",
			method:'post',
			pagination:true,
			singleSelect:true,
			clickToSelect:true,
			contentType:"application/x-www-form-urlencoded",
			queryParams:function(param){
				return	{
					'uid':$('#tbxUid').val(),
					'role':$('#selSysUserRole').val()
				};
			},
			columns:[
				{field:'uid',halign:'center'},
				{field:'role',halign:'center'},
				{field:'nickName',halign:'center'},
				{field:'createTime',halign:'center'}
			]
		});
	};
	
	return {
		searchButtonClick : searchButtonClick
	};
});