function login() {
	var formData = $("#form").serialize2Json();//封装成json的格式

	$.ajax({
		type : "POST",
		contentType : "application/json;charset=utf-8",
		url : _path + "/ums/user/validatelogin",
		dataType : "json",
		data : JSON.stringify(formData),//封装后转换成为Hash Map的格式传递给后台
		success : function(data) {
			if (data.status == "S") {
				if(data.result.accountTypeFk ==	200){
					window.location = _path + "/ums/user/adminIndex";
				}else{
					window.location = _path + "/ums/user/customerIndex";
				}
			} else if (data.status == "F") {
				alert(data.message);
			}
		},
		error : function() {
			alert("error");
		}
	});
}
