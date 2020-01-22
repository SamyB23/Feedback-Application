<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta http-equiv="X-UA-Compatible" content="ie=edge">
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css"
	integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO"
	crossorigin="anonymous">
<script
	src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js"
	integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy"
	crossorigin="anonymous"></script>
<title>Feedback Form</title>
</head>
<body>
	<div class="container">
		<h1 class="text-center">Feedback Form</h1>
		<form action="post">
			<div class="form-group">
				<label for="exampleName">Name</label> <input type="text"
					class="form-control" id="name" name="user_name"
					placeholder="Enter Your Name">
			</div>
			<div class="form-group">
				<label for="exampleEmail">Email</label> <input type="email"
					class="form-control" id="email" name="email"
					placeholder="Enter email">
			</div>
			<div class="form-group">
				<label for="comment">Review:</label>
				<textarea class="form-control" rows="5" id="review" name="review" placeholder="Write your review here..."></textarea>
			</div>
			
			<button type="submit" class="btn btn-primary">Submit</button>
		</form>
	</div>

</body>
</html>