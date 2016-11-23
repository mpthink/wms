<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@ page language="java" import="java.lang.*, java.util.*"%>
<html>
<head>
    <%@ include file="../common/head.jsp" %>
</head>
<body class="hold-transition skin-blue sidebar-mini">
<div class="col-md-12">

	 <!-- form start -->
	<form class="form-horizontal" role="form" id="form_role_add">
		<div class="box-body">
			<div class="form-group">
	            <label for="roleName" class="col-sm-2 control-label">角色名称</label>
	            <div class="col-sm-10">
	              <input type="text" class="form-control" name="name" value="">
	            </div>
           	</div>
           	<div class="form-group">
	            <label for="roleName" class="col-sm-2 control-label">角色代码</label>
	            <div class="col-sm-10">
	              <input type="text" class="form-control" name="roleCode" value="">
	            </div>
           	</div>
           	<div class="form-group">
	            <label for="roleName" class="col-sm-2 control-label">角色描述</label>
	            <div class="col-sm-10">
	              <input type="text" class="form-control" name="description" value="">
	            </div>
           	</div>
          
           	<div class="form-group">
           		<label class="col-sm-2 control-label">角色权限</label>
           		<div class="col-sm-10">
           			<c:forEach var="rootMenu" items="${menus }">
           				<c:if test='${rootMenu.pid eq 0 }'>
           					<dl class="permission-list">
								<dt>
									<label>
										<input type="checkbox" value="${rootMenu.id }" name="check" id="user-Character-0">${rootMenu.name }
									</label>
								</dt>
								<dd>
									<c:forEach var="subMenu" items="${menus }">
           								<c:if test="${subMenu.pid == rootMenu.id }">
           									<dl class="cl">
           										<dt>
	           										<label>
	           											<input type="checkbox" value="${subMenu.id }"  name="check" id="user-Character-0">${subMenu.name }  
	           										</label>
           											&nbsp;&nbsp;
           											<c:forEach var="function" items="${menus }">
           												<c:if test="${function.pid == subMenu.id }">
           													<label>
			           											<input type="checkbox" value="${function.id }"  name="check" id="user-Character-0">${function.name }  
			           										</label>
		           											&nbsp;&nbsp;
           												</c:if>
           											</c:forEach>
           										</dt>
           									</dl>
           								</c:if>
           							</c:forEach>
								</dd>           					
           					</dl>
           				</c:if>
           			</c:forEach>
           		</div>
           	</div>
           <div class="box-footer">
                <button type="button" class="btn btn-primary center-block" id="roleAdd">提交</button>
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
	$("#roleAdd").click(function(){
		var data= $("#form_role_add").serialize();
		$.post("${ctx}/role/addRole",data,function(result){
			layer_close();
			parent.location.reload();
		},"text");
	});
});

</script>

</body>
</html>