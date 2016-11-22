<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@ page language="java" import="java.lang.*, java.util.*"%>
<html>
<head>
    <%@ include file="../common/head.jsp" %>
</head>
<body class="hold-transition skin-blue sidebar-mini">
<div class="col-md-12">

	 <!-- form start -->
	<form class="form-horizontal" role="form" id="form_role_update">
		<div class="box-body">
			<div class="form-group">
	            <label for="roleName" class="col-sm-2 control-label">角色名称</label>
	            <input type="hidden" id="id" name="id" value="${role.id}">
	            <div class="col-sm-10">
	              <input type="text" class="form-control" name="name" value="${role.name}">
	            </div>
           	</div>
           	<div class="form-group">
	            <label for="roleName" class="col-sm-2 control-label">角色代码</label>
	            <div class="col-sm-10">
	              <input type="text" class="form-control" name="roleCode" value="${role.roleCode}">
	            </div>
           	</div>
           	<div class="form-group">
	            <label for="roleName" class="col-sm-2 control-label">角色描述</label>
	            <div class="col-sm-10">
	              <input type="text" class="form-control" name="description" value="${role.description}">
	            </div>
           	</div>
          
           	<div class="form-group">
           		<label class="col-sm-2 control-label">角色权限</label>
           		<div class="col-sm-10">
           		<% List<Map<String,Object>> rootMenus  =  (List<Map<String,Object>>)request.getAttribute("rootMenus");
					for(Map<String,Object> rootMenu : rootMenus) { %>           		
           			<dl  class="permission-list">
						<dt>
							<label>
								<% if(rootMenu.get("rootMenu") != null && rootMenu.get("rootMenu").equals(true)) { %>
									<input type="checkbox" value="<%=rootMenu.get("id") %>" checked="checked" name="check" id="user-Character-0">  
					       			<%=rootMenu.get("name") %>
					       		<% } else { %>
					       			<input type="checkbox" value="<%=rootMenu.get("id") %>"  name="check" id="user-Character-0">  
					       			<%=rootMenu.get("name") %>
					       		<% } %>
							</label>
						</dt>
						<dd>
							<% List<Map<String,Object>> subMenus = (List<Map<String,Object>>)rootMenu.get("subMenus"); 
								for(Map<String,Object> subMenu : subMenus) { %>
								<dl class="cl">
									<dt>
										<label>
											<% if(subMenu.get("subMenu") != null && subMenu.get("subMenu").equals(true)) { %>
								       			<input type="checkbox" value="<%=subMenu.get("id") %>" checked="checked" name="check" id="user-Character-0">  
								       			<%=subMenu.get("name") %>
								       		<% } else { %>
								       			<input type="checkbox" value="<%=subMenu.get("id") %>"  name="check" id="user-Character-0">  
								       			<%=subMenu.get("name") %>
								       		<% } %>
								       		
								       		<% List<Map<String,Object>> funtionMenus = (List<Map<String,Object>>)subMenu.get("funtionMenus"); %>
								       		<%for(Map<String,Object> functionMenu:funtionMenus){ %>
								       			<%if(functionMenu.get("function") != null &&  functionMenu.get("function").equals(true)){ %>
								       				<input type="checkbox" value="<%=functionMenu.get("id") %>" checked="checked" name="check" id="user-Character-0">  
								       				<%=functionMenu.get("name") %>
								       			<%}else{ %>
								       				<input type="checkbox" value="<%=functionMenu.get("id") %>"  name="check" id="user-Character-0">  
								       				<%=functionMenu.get("name") %>
								       			<%} %>
								       		<%} %>
										</label>
									</dt>
								</dl>
							<% } %>
						</dd>          			
           			</dl>
           			<%} %>
           		</div>
           	</div>
           <div class="box-footer">
                <button type="button" class="btn btn-primary center-block" id="roleSave">提交</button>
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
	$("#roleSave").click(function(){
		var data= $("#form_role_update").serialize();
		$.post("${ctx}/role/updateRole",data,function(result){
			layer_close();
			parent.location.reload();
		},"text");
	});
});

</script>

</body>
</html>