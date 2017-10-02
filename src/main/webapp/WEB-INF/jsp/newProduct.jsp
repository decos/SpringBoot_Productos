<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<body>
    <h1>Add new product</h1>
        
    <form:form modelAttribute="form">
        <form:errors path="" element="div" />
        <div>
            <form:label path="nombre">Name: </form:label>
            <form:input path="nombre" />
            <form:errors path="nombre" />
        </div>
        <div>
            <form:label path="precio">Price: </form:label>
            <form:input path="precio" />
            <form:errors path="precio" />
        </div>
        </br>
        <div>
            <input type="submit" value="Send" />
        </div>
    </form:form>
</body>
</html>
	