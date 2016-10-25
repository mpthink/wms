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
       	 角色列表
      </h1>
      <ol class="breadcrumb">
        <li><a href="#"><i class="fa fa-dashboard"></i> 首页</a></li>
        <li><a href="${ctx}/role/list">角色管理</a></li>
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
						<h3 class="box-title">角色列表</h3>
					</div>
					<!-- /.box-header -->
					<div class="box-body">
						<table id="roleList" class="table table-bordered table-hover">
							<thead>
							<tr>
								<th>角色名称</th>
				                <th>角色权限</th>
				                <th>操作</th>
							</tr>
							</thead>
							<tbody>
								<c:forEach var="role" items="${roles}">
									<tr>
										<td>${role.roleName}</td>
										<td>${role.rolePermission}</td>
										<td>
											test
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
    $("#example1").DataTable();
    $('#example2').DataTable({
      "paging": true,
      "lengthChange": false,
      "searching": false,
      "ordering": true,
      "info": true,
      "autoWidth": false
    });
  });
</script>

</body>
</html>