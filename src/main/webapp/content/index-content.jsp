<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page language="java" session="true" %>
<%--
  Created by IntelliJ IDEA.
  User: josephcaughlin
  Date: 11/4/17
  Time: 10:38 AM
  To change this template use Preferences | File and Code Templates--%>

<h1>Hey There</h1>
<h1>${ivan}</h1>
<h2>${evan}</h2>

<h2>Hello world!</h2>
<form method="post" action="/HandleData">

    <div class="form-group row">
        <label for="facility" class="col-form-label col-md-2">Type</label>
        <select class="custom-select ml-3" id="facility" name="facility">
            <option value="all">All</option>
            <c:forEach var="facility" items="${facilities}">
                <option value="${facility.facilityid}">${facility.name}</option>
            </c:forEach>
            <!--<option value="1">Federal</option>
            <option value="2">Madison</option>-->
        </select>
    </div>

    <br />
    <div>
        <input type="radio" name="dataType" value="json" checked> JSON<br>
        <input type="radio" name="dataType" value="xml"> XML<br>
    </div>


     <input type="submit" id="submit" name="submit" />
</form>
<!--
<ul>
    <li><a href="http://localhost:8080/teamproject/json/facility">Item</a></li>
    <li>Item2</li>
    <li>Item3</li>
    <li>Item4</li>
    <li>Item5</li>
</ul>-->

