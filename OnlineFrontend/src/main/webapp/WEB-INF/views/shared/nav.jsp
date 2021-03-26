<div class="topnav">

	<ul>
		<li class="topnav topnav-left topnav-left-active"><a
			href="${contextRoot}/home">Home</a></li>
		<li class="nav-item dropdown">
		<a class="nav-link dropdown-toggle"
			href="#" id="navbarDropdown" role="button" data-toggle="dropdown"
			aria-haspopup="true" aria-expanded="false"> Category </a>
			<div class="dropdown-menu" aria-labelledby="navbarDropdown">
				<c:forEach items="${categorylist}" var="category">
					<a href="${contextRoot}/show/category/${category.id}/products"
						class="dropdown-item">${category.name} </a>
				</c:forEach>
			</div></li>
		<li class="topnav topnav-left"><a href="${contextRoot}/about">About</a>
		</li>
		<li class="topnav topnav-left"><a href="${contextRoot}/contact">Contact</a>
		</li>
		<li class="topnav topnav-right"><a href="#">Sign-Up</a></li>
		<li class="topnav topnav-right"><a href="#">Sign-In</a></li>

	</ul>

</div>