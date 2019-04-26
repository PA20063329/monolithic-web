<html>
<head>
<link href="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.8.1/css/all.css" integrity="sha384-50oBUHEmvpQ+1lW4y57PTFmhCaXp0ML5d60M1M7uH2+nqUivzIebhndOJK28anvf" crossorigin="anonymous">
<style>
.divider-text {
    position: relative;
    text-align: center;
    margin-top: 15px;
    margin-bottom: 15px;
}
.divider-text span {
    padding: 7px;
    font-size: 12px;
    position: relative;   
    z-index: 2;
}
.divider-text:after {
    content: "";
    position: absolute;
    width: 100%;
    border-bottom: 1px solid #ddd;
    top: 55%;
    left: 0;
    z-index: 1;
}
</style>
</head>
<body>
<br><br><br>
	<div class="container">
		<div class="card bg-light">
			<article class="card-body mx-auto" style="max-width: 400px;">
				<h4 class="card-title mt-3 text-center">Add Credentials</h4>
				<form method="POST" action="/saveCredentials">
					<div class="form-group input-group">
						<div class="input-group-prepend">
							<span class="input-group-text"> <i class="fas fa-user"></i>
							</span>
						</div>
						<input name="userName" required class="form-control" placeholder="UserName" type="text">
					</div>
					<div class="form-group input-group">
						<div class="input-group-prepend">
							<span class="input-group-text"> <i class="fas fa-envelope"></i>
							</span>
						</div>
						<input name="email" required  class="form-control" placeholder="Email address" type="email">
					</div>
					<div class="form-group input-group">
						<div class="input-group-prepend">
							<span class="input-group-text"> <i class="fas fa-user-circle"></i>
							</span>
						</div>
						<select required name="account" class="form-control">
							<option></option>
							<option value="Facebook"> Facebook</option>
							<option value="Instagram"> Instagram</option>
							<option value="Twitter"> Twitter</option>
						</select>
					</div>
					<div class="form-group input-group">
						<div class="input-group-prepend">
							<span class="input-group-text"> <i class="fas fa-lock"></i>
							</span>
						</div>
						<input name="password" required class="form-control" placeholder="Enter Password" type="password">
					</div>
					<div class="form-group">
						<button type="submit" class="btn btn-primary btn-block">Save Credentails</button>
					</div>
				</form>
			</article>
		</div>

	</div>
	<script
		src="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
	<script
		src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>

</body>
</html>