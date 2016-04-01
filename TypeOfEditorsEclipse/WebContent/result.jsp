<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import= "java.util.*"%>
<html>
<head>
    <title></title>
</head>
<body>
<p>
<h1 align="center">You are:</h1>
<%
  List styles = (List) request.getAttribute("styles");
  Iterator it = styles.iterator();
  while(it.hasNext()) {
    out.print("<br>try: " + it.next());
  }
%>
</body>
</html>