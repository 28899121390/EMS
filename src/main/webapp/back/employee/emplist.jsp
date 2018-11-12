<%@page pageEncoding="UTF-8" isELIgnored="false" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<c:set var="now" value="<%=new java.util.Date()%>" />
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<title>emplist</title>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/back/css/style.css" />
	</head>
	<body>
		<div id="wrap">
			<div id="top_content"> 
				<div id="header">
					<div id="rightheader">
						<p>
							<fmt:formatDate value="${now}" pattern="yyyy-MM-dd hh:mm:ss"/>
							<br />
							安全退出
						</p>
					</div>
					<div id="topheader">
						<h1 id="title">
							<a href="#">main</a>
						</h1>
					</div>
					<div id="navigation">
					</div>
				</div>
				<div id="content">
					<p id="whereami">
					</p>
					<h1>
						Welcome <span style="color: red">${sessionScope.admin.realname}</span>!
					</h1>
					<table class="table">
						<tr class="table_header">
							<td>
								ID
							</td>
							<td>
								Name
							</td>
							<td>
								Salary
							</td>
							<td>
								Age
							</td>
							<td>
								Operation
							</td>
						</tr>
						<c:forEach items="${requestScope.empls}" var="user">
						<tr class="row1">
							<td>
								${user.id}
							</td>
							<td>
								${user.name}
							</td>
							<td>
									${user.salary}
							</td>
							<td>
									${user.age}
							</td>
							<td>
								<a href="${pageContext.request.contextPath}/empl/delete?id=${user.id}">delete emp</a>&nbsp;<a href="updateEmp.jsp">update emp</a>
							</td>
						</tr>
						</c:forEach>
						<%--<tr class="row2">
							<td>
								2
							</td>
							<td>
								lishi
							</td>
							<td>
								20000
							</td>
							<td>
								20
							</td>
							<td>
								<a href="emplist.jsp">delete emp</a>&nbsp;<a href="updateEmp.jsp">update emp</a>
							</td>
						</tr>--%>
					</table>
					<p>
						<input type="button" class="button" value="Add Employee" onclick="location='${pageContext.request.contextPath}/back/employee/addEmp.jsp'"/>
					</p>
				</div>
			</div>
			<div id="footer">
				<div id="footer_bg">
				ABC@126.com
				</div>
			</div>
		</div>
	</body>
</html>
