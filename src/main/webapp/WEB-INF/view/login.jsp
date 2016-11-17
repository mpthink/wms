<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<html>
<head>
    <%@ include file="common/head.jsp" %>
</head>
<body class="hold-transition login-page">
<div class="login-box">
  <div class="login-logo">
    	<b>WMS</b>
  </div>
  <!-- /.login-logo -->
  <div class="login-box-body">
    <p class="login-box-msg">warehouse management system</p>

    <form action="${ctx }/login" method="post">
      <div class="form-group has-feedback">
        <input type="text" name="username" class="form-control" placeholder="User Name">
        <span class="glyphicon glyphicon-envelope form-control-feedback"></span>
      </div>
      <div class="form-group has-feedback">
        <input type="password" name="password" class="form-control" placeholder="Password">
        <span class="glyphicon glyphicon-lock form-control-feedback"></span>
      </div>
      <div class="row">
        <div class="col-xs-8">
          <div class="checkbox icheck">
            <label>
              <input type="checkbox" name="rememberMe" id="online" value="1"> Remember Me
            </label>
          </div>
        </div>
        <!-- /.col -->
        <div class="col-xs-4">
          <button type="submit" class="btn btn-primary btn-block btn-flat">Sign In</button>
        </div>
        <!-- /.col -->
      </div>
        <div class="row">
	      	 	<c:if test="${message != null }">
	      	 	<div class="text-center alert alert-danger"><span>${message}</span></div>
	      	 </c:if>
	    </div>
      
    </form>
  </div>
  <!-- /.login-box-body -->
</div>
<!-- /.login-box -->

<%--foot--%>
<%@ include file="common/foot.jsp" %>
<script>
  $(function () {
    $('input').iCheck({
      checkboxClass: 'icheckbox_square-blue',
      radioClass: 'iradio_square-blue',
      increaseArea: '20%' // optional
    });
  });
</script>
</body>
</html>
