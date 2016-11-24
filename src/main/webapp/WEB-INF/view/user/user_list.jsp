<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<html>
<head>
    <%@ include file="../common/head.jsp" %>
</head>
<body class="hold-transition skin-blue sidebar-mini">
<div class="wrapper">
	<%--header--%>
    <%@ include file="../common/header.jsp" %>
    <%--aside--%>
    <%@ include file="../common/siderbar.jsp" %>
    <!-- Content Wrapper. Contains page content -->
    <!-- Content Wrapper. Contains page content -->
  <div class="content-wrapper">
    <!-- Content Header (Page header) -->
    <section class="content-header">
      <h1>
       	用户列表
      </h1>
      <ol class="breadcrumb">
        <li><a href="#"><i class="fa fa-dashboard"></i> 首页</a></li>
        <li>系统管理</li>
        <li><a href="${ctx}/role/list">用户管理</a></li>
        <li class="active">列表</li>
      </ol>
    </section>

    <!-- Main content -->
    <section class="content">

      <!-- Your Page Content Here -->
		<div class="row">
			<div class="col-xs-12">
				<div class="box">
					<div class="box-header">
						<h3 class="box-title">用户列表</h3>
					</div>
					<!-- /.box-header -->
					<div class="box-body">
						<div style="width:90px;">
							<span><button type="button" class="btn btn-block btn-primary" id="toAddUser">添加用户</button></span>
						</div>
						<br>
						<table id="roleList" class="table table-bordered table-striped">
							<thead>
							<tr>
								<th>用户名</th>
								<th>别名</th>
								<th>密码</th>
				                <th>邮箱</th>
				                <th>电话</th>
				                <th>创建日期</th>
				                <th>登陆时间</th>
				                <th>IP</th>
				                <th>状态</th>
				                <th>操作</th>
							</tr>
							</thead>
							<tbody>
								<c:forEach var="user" items="${users }">
									<tr>
										<td>${user.username}</td>
										<td>${user.nickname}</td>
										<td>${user.password}</td>
										<td>${user.email}</td>
										<td>${user.phone}</td>
										<td>${user.createTime}</td>
										<td>${user.lastLoginTime}</td>
										<td>${user.lastLoginIp}</td>
										<td>
											<c:if test="${user.status eq 1 }">正常</c:if>
											<c:if test="${user.status eq 0 }">未激活</c:if>
											<c:if test="${user.status eq 2 }">禁用</c:if>
										</td>
										<td>
											<div class="btn-group-xs">
												<shiro:hasPermission name="sys:user:update"></shiro:hasPermission>
					                            <button type="button" class="btn btn-linkedin" onclick="updateUser('用户编辑','${ctx}/user/toUpdateUser/${user.id }')">
					                                <i class="fa fa-edit"></i>&nbsp;<span>编辑</span></button>
					                            <shiro:hasPermission name="sys:user:delete"></shiro:hasPermission>
					                            <button type="button" class="btn btn-instagram" onclick="deleteUser(${user.id})">
					                                <i class="fa fa-trash"></i>&nbsp;<span>删除</span></button>
				                        	</div>
										</td>
									</tr>
								</c:forEach>
							</tbody>
						</table>
					</div>
				</div>
			</div>
		</div>
		
    </section>
    <!-- /.content -->
  </div>
    <%--footer--%>
    <%@ include file="../common/footer.jsp" %>
</div>
<%--foot--%>
<%@ include file="../common/foot.jsp" %>

<!-- page script -->
<script>
  $(function () {
	  $("#roleList").DataTable();
  });
  
  /*管理员-角色-编辑*/
  function updateUser(title,url,w,h){
	if (title == null || title == '') {
		title=false;
	};
	if (url == null || url == '') {
		url="404.html";
	};
	if (w == null || w == '') {
		w=600;
	};
	if (h == null || h == '') {
		h=($(window).height() - 400);
	};
	layer.open({
		type:2,
		area:[w+'px', h+'px'],
		fix:false,
		maxmin:true,
		shade:0.4,
		title:title,
		content:url
	});
  }
  
  /*管理员-角色-删除*/
  function deleteUser(userId){
	  //询问框
	  layer.confirm('确定删除用户？', {
		  skin: 'layui-layer-molv', //样式类名
		  btn: ['确定','取消'], //按钮
		  title: '删除用户'
		}, function(){
			var index = layer.load();
			$.ajax({
			 type:"POST",
			 url:"${ctx}/user/delete/"+userId,
			 datatype:"text",
			 success:function(data){
			  layer.closeAll();
			  if(data=="true"){
				  layer.msg('删除成功', {icon: 1});
				  window.location.reload();
			  }else{
				  layer.msg('删除失败', {icon: 2});
				  window.top.location.href="${ctx}/user/list";
			  }
			 }
			});
		});
  	}
  
$(function(){
	$("#toAddUser").click(function(){
		layer.open({
			type:2,
			area:['50%','60%'],
			title:'添加用户',
			shadeClose:true,
			maxmin:true,
			shade:0.8,
			content:'${ctx}/user/toAddUser'
		});
	});
});
  
  
  
  
</script>

</body>
</html>