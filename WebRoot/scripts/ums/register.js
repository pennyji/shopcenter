function register() {
	var formData = $("#form").serialize2Json();
	
	$.ajax({
		type : "POST",
		contentType : "application/json;charset=utf-8",
		url : "/shopcenter/ums/user/register",
		dataType : "json",
		data : JSON.stringify(formData),
		success : function(data) {
			if (data.status == "S") {
				alert("注册成功！");
				window.location = _path + "/ums/user/login";
			} else if (data.status == "F") {
				alert(data.message);
			}
		},
		error : function() {
			alert("error");
		}
	});

}