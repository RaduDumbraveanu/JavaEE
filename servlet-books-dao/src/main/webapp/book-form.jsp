<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>servlet-book-from project</title>
    <style>
        .form-edit {
            width: 500px;
        }
    </style>
</head>
<body>
    <h1>Update book</h1>
    <form method="post">
        <input type="hidden" name="id" value="${id}">
        Title:<br>
        <input type="text" name="title" value="${book.title}" class="form-edit"><br>
        Edition:<br>
        <input type="text" name="edition"  value="${book.editionNumber}" class="form-edit"><br>
        URL:<br>
        <input type="text" name="url"  value="${book.url}" class="form-edit"><br>
        <input type="submit" value="Save">
    </form>
</body>
</html>