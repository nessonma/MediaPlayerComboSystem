<%@ page contentType="text/html;charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title>404 - 页面不存在</title>
</head>

<body>
	<div>
		<center>
			<div style="padding-top: 100px; padding-bottom: 100px;">
				<span style="font-size: 16px; font-weight: bold;">页面不存在.</span><a style="color: #378BD1;"
					href="<%=request.getContextPath()%>/index.action">返回首页</a>
			</div>
		</center>
	</div>
</body>
</html>