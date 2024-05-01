<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Add News</title>
</head>
<body>
    <h1>Add News</h1>
    <form action="/addnews" method="post">
        <label for="category">News Category:</label>
        <select id="category" name="category" required>
            <option value="">Select a category</option>
            <option value="Education">Education</option>
            <option value="Sports">Sports</option>
            <option value="Entertainment">Entertainment</option>
        </select>
        <br><br>
        <label for="description">Description:</label><br>
        <textarea id="description" name="description" rows="4" cols="50" required></textarea>
        <br><br>
        <label for="imageUrl">Image:</label><br>
        <input type="text" id="imageUrl" name="imageUrl" required>
        <br><br>
        <input type="submit" value="Save">
    </form>
</body>
</html>
