<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="layout" tagdir="/WEB-INF/tags/layouts" %>
<layout:common>
    <form method="post" action="index_ps.jsp">
        <input type="text" name="subject"><br>
        <textarea name="content"></textarea>
        <br>
        <button type="submit">작성하기</button>
    </form>
</layout:common>