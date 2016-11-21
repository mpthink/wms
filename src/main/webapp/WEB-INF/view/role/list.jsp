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
        <li>系统管理</li>
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
						<table id="roleList" class="table table-bordered table-striped">
							<thead>
							<tr>
								<th>角色名称</th>
								<th>角色编码</th>
				                <th>角色描述</th>
				                <th>操作</th>
							</tr>
							</thead>
							<tbody>
								<c:forEach var="role" items="${roles}">
									<tr>
										<td>${role.name}</td>
										<td>${role.roleCode}</td>
										<td>${role.description}</td>
										<td>
											<div class="btn-group-xs">
												<shiro:hasPermission name="sys:role:update">
					                            <button type="button" class="btn btn-linkedin" onclick="updateRole('角色编辑','${ctx}/role/toUpdateRole/${role.id }')">
					                                <i class="fa fa-edit"></i>&nbsp;<span>编辑</span></button>
					                            </shiro:hasPermission>
					                            <shiro:hasPermission name="sys:role:delete">
					                            <button type="button" class="btn btn-instagram" onclick="deleteRole(${role.id})">
					                                <i class="fa fa-trash"></i>&nbsp;<span>删除</span></button>
					                            </shiro:hasPermission>
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
  function updateRole(title,url,w,h){
	if (title == null || title == '') {
		title=false;
	};
	if (url == null || url == '') {
		url="404.html";
	};
	if (w == null || w == '') {
		w=800;
	};
	if (h == null || h == '') {
		h=($(window).height() - 200);
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
  function deleteRole(roleId){
	  //询问框
	  layer.confirm('确定删除角色？', {
		  skin: 'layui-layer-molv', //样式类名
		  btn: ['确定','取消'], //按钮
		  title: '删除角色'
		}, function(){
			var index = layer.load();
			$.ajax({
			 type:"POST",
			 url:"${ctx}/role/delete/"+roleId,
			 datatype:"text",
			 success:function(data){
			  layer.closeAll();
			  if(data=="true"){
				  layer.msg('删除成功', {icon: 1});
				  window.location.reload();
			  }else{
				  layer.msg('删除失败', {icon: 2});
				  window.top.location.href="${ctx}/role/list";
			  }
			 }
			});
		});
  	}
  
  
  
  
  
  
</script>

</body>
</html>