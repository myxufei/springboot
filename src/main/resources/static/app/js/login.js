function login(){
	var account=$("#account").val();
	var password=$("#password").val();
	var remember=$("#remember").val();
	if(account==''||account==null){
		alert("用户名不能为空");
		return false;
	}
	if(password==''|password==null){
		alert("密码不能为空");
		return false;
	}
	$.ajax({
		type: "post",
		url: ctx + "login/login",
	    data: {"account":account,"password":password,"remember":remember},
	    dataType: "json",
	    success: function(r){
            if (r.code == "ER001") {
                location.href = ctx + 'index/index';
            } else {
            	alert(r.msg);
            }
	    }

	});

}