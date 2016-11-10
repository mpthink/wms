<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<!-- Left side column. contains the logo and sidebar -->
  <aside class="main-sidebar">

    <!-- sidebar: style can be found in sidebar.less -->
    <section class="sidebar">

      <!-- Sidebar user panel (optional) -->
      <div class="user-panel">
        <div class="pull-left image">
          <img src="${ctx}/static/lte/img/user2-160x160.jpg" class="img-circle" alt="User Image">
        </div>
        <div class="pull-left info">
          <p>管理员：</p>
          <!-- Status -->
          <a href="#"><i class="fa fa-circle text-success"></i> Online</a>
        </div>
      </div>

      <!-- search form (Optional) -->
      <form action="#" method="get" class="sidebar-form">
        <div class="input-group">
          <input type="text" name="q" class="form-control" placeholder="Search...">
              <span class="input-group-btn">
                <button type="submit" name="search" id="search-btn" class="btn btn-flat"><i class="fa fa-search"></i>
                </button>
              </span>
        </div>
      </form>
      <!-- /.search form -->

      <!-- Sidebar Menu -->
      <ul class="sidebar-menu">
        <li class="header">导航菜单</li>
        <!-- Optionally, you can add icons to the links -->
        <c:forEach items="${permissions }" var="permission">
	        <c:if test="${permission.pid==0 }">
				<li class="active treeview">
					<a href="#"><i class="fa fa-link"></i> 
						<span>${permission.name}</span>
						<span class="pull-right-container">
		              <i class="fa fa-angle-left pull-right"></i>
		            </span>
					</a>
					<ul class="treeview-menu"> 
			        	<c:forEach items="${permissions }" var="perm">
									<c:if test="${permission.id == perm.pid }">
											<li><a href="${ctx}${perm.url}" data-title="${perm.name }"><i class="${perm.icon }"></i>${perm.name }</a></li>
									</c:if>
						</c:forEach>
					</ul>
				</li>
	        </c:if>
        </c:forEach>
      </ul>
      <!-- /.sidebar-menu -->
    </section>
    <!-- /.sidebar -->
  </aside>