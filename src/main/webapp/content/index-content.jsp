<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<div id="wrapper">
    <p>
        Welcome to the Prison Population API. Our API allows you to get information about
        prison populations based on location and demographic - ethnicity or age. Output comes
        JSON or XML
    </p>
    <p id="textleft">
        To use this API use the following parameters:<br/>
        incarceration/xml                      to output on XML<br/>
        incarceration/json                     to output on JSON<br/><br/>
        Additionally use:<br/>
        /facility/all                          to retrieve all the facilities<br/>
        /facility/all?both=true                to retrieve all facilities including ages and ethnicities<br/>
        /facility/all/age                      to retrieve all facilities including the ages<br/>
        /facility/all/ethnic                   to retrieve all facilities including the ethnicities<br/>
        /facility/id                           to retrieve a specific facility<br/>
        /facility/id/age                       to retrieve a specific facility and the age<br/>
        /facility/id/ethnic                    to retrieve a specific facility and the ethnicity<br/>
        /facility/id/age/ethnic                to retrieve a specific facility, the age and the ethnicity<br/>
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
                    <input type="checkbox" id="ethnic" name="ethnic"><br>
                </fieldset>
            </div>
        </div>
         <input type="submit" id="submit" name="submit" />
    </form>
</div>

