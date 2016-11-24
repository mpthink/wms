<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@ page language="java" import="java.lang.*, java.util.*"%>
<html>
<head>
    <%@ include file="../common/head.jsp" %>
</head>
<body class="hold-transition skin-blue sidebar-mini">
<div class="col-md-6">

	 <!-- form start -->
	<form class="form-horizontal" role="form" id="form_user_update">
		<div class="box-body">
			<div class="form-group">
	            <label for="userName" class="col-sm-2 control-label">用户名</label>
	            <input type="hidden" id="id" name="id" value="${user.id}">
	            <div class="col-sm-10">
	              <input type="text" class="form-control" name="username" value="${user.username}">
	            </div>
           	</div>
           	<div class="form-group">
	            <label for="userName" class="col-sm-2 control-label">用户别名</label>
	            <div class="col-sm-10">
	              <input type="text" class="form-control" name="nickname" value="${user.nickname}">
	            </div>
           	</div>
           	<div class="form-group">
	            <label for="userName" class="col-sm-2 control-label">密码</label>
	            <div class="col-sm-10">
	              <input type="password" class="form-control" name="password" value="${user.password}">
	            </div>
           	</div>
           	<div class="form-group">
	            <label for="userName" class="col-sm-2 control-label">邮箱</label>
	            <div class="col-sm-10">
	              <input type="email" class="form-control" name="email" value="${user.email}">
	            </div>
           	</div>
           	<div class="form-group">
	            <label for="userName" class="col-sm-2 control-label">电话</label>
	            <div class="col-sm-10">
	              <input type="text" class="form-control" name="phone" value="${user.phone}">
	            </div>
           	</div>
           	<div class="form-group">
	            <label for="userName" class="col-sm-2 control-label">状态</label>
	            <div class="col-sm-10">
	              <select class="form-control" name="status" id="status">
				      <option value="0" <c:if test="${user.status eq 0 }">selected</c:if> >未激活</option>
				      <option value="1" <c:if test="${user.status eq 1 }">selected</c:if> >正常</option>
				      <option value="2" <c:if test="${user.status eq 2 }">selected</c:if> >禁用</option>
				    </select>
	            </div>
           	</div>
           	
           <div class="box-footer">
                <button type="button" class="btn btn-primary center-block" id="userSave">提交</button>
  		   </div>
         <!-- /.box-footer -->
		</div>
	</form>
	<!-- form end -->	
</div>

<%--foot--%>
<%@ include file="../common/foot.jsp" %>

<!-- page script -->
<script>

function layer_close(){
	var index = parent.layer.getFrameIndex(window.name);
	parent.layer.close(index);
};

$(function(){
	$("#userSave").click(function(){
		var data= $("#form_user_update").serialize();
		$.post("${ctx}/user/updateUser",data,function(result){
			layer_close();
			parent.location.reload();
		},"text");
	});
});

</script>

</body>
</html>