<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page language="java" session="true" %>
<div id="wrapper">
    <p>
        Welcome to the Prison Population API. Our API allows you to get information about
        prison populations based on location, demographic, or ethnicity demographic. Output comes in
    </p>
    <p>
        To use the Incar
    </p>
    <form method="post" action="HandleData">
        <div>
            <label for="facility" >Facility:</label>
            <select id="facility" name="facility">
                <option value="all">All</option>
                <c:forEach var="facility" items="${facilities}">
                    <option value="${facility.facilityid}">${facility.name}</option>
                </c:forEach>
            </select>
        </div>
        <div id="buttonbox">
            <div class="alignLeft">
                <fieldset>
                    <legend>Output Type</legend>
                    <label for name="json">Json:</label>
                    <input type="radio" name="dataType" value="json" checked><br>
                    <label for name="xml">XML:</label>
                    <input type="radio" name="dataType" value="xml"><br>
                </fieldset>
            </div>
            <div class="alignRight">
                <fieldset>
                    <legend>Demographic Selector</legend>
                    <label for name="age">Age:</label>
                    <input type="checkbox" id="age" name="age"><br>
                    <label for name="ethnicity">Ethnicity:</label>
                    <input type="checkbox" id="ethnicity" name="ethnicity"><br>
                </fieldset>
            </div>
        </div>
         <input type="submit" id="submit" name="submit" />
    </form>
    <div id="output">
        <jsp:include page="/content/output.jsp"/>
    </div>
</div>
<!--
<ul>
    <li><a href="http://localhost:8080/teamproject/json/facility">Item</a></li>
    <li>Item2</li>
    <li>Item3</li>
    <li>Item4</li>
    <li>Item5</li>
</ul>-->

