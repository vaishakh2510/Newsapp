<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>News List</title>
    <style>
        .news-tile {
            border: 1px solid #ccc;
            padding: 10px;
            margin: 10px;
            width: 100%;
            display: flex; /* Use flexbox layout */
            align-items: center; /* Center items vertically */
        }

        .news-container {
            width: 100%;
        }

        .news-image {
            max-width: 100px;
            height: 100px;
            margin-right: 10px; /* Add margin to separate image from text */
        }
    </style>
</head>
<body>
    <h1>News List</h1>
    <div class="news-container">
        <c:forEach items="${newsList}" var="news">
            <div class="news-tile">
                <img src="${pageContext.request.contextPath}/images/${news.imageUrl}" class="news-image">
                <div>
                    <h2>${news.category}</h2>
                    <p>${news.description}</p>
                </div>
            </div>
        </c:forEach>
    </div>
</body>
</html>
