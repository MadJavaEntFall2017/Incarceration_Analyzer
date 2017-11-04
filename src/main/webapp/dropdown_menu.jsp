<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%--
  Created by IntelliJ IDEA.
  User: josephcaughlin
  Date: 10/5/17
  Time: 1:22 PM
  To change this template use File | Settings | File Templates.
--%>
<!--Dropdown Menu Button-->
<div class="col-sm-2 menu">
    <div class="btn-group">
        <button type="button" class="btn btn-info-outline">Menu</button>
        <button type="button" class="btn btn-info-outline dropdown-toggle" data-toggle="dropdown">
            <span class="caret"></span>
            <span class="sr-only">Toggle Dropdown</span>
        </button>
        <div class="dropdown-menu">
            <a class="dropdown-item" href="/src/main/java/edu/matc/controller/ServletStartup.java">Admin</a>
            <a class="dropdown-item" href="#">Another action</a>
            <a class="dropdown-item" href="#">Reports</a>
            <a>
                <hr>
            </a>
            <a class="dropdown-item" href="#"><i>User Settings</i></a>
            <a class="dropdown-item" href="#"><strong>Sign Out</strong></a>
        </div>
    </div>
</div>

