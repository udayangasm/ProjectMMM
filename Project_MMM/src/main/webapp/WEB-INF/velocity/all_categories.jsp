	<div class="generic-container">
		<h2>ProjectMMM</h2>
		<div class="panel panel-default">
			<!-- Default panel contents -->
		    <div class="panel-heading"><span class="lead">All Categories</span></div>
		    <div class="tablecontainer">
				<ul>
				  <li ng-repeat="category in ctgController.categories">
				  		<a ui-sref="category.login({categoryId:'Login'})">Login</a>
				  		
				  </li>
				</ul>
			</div>
		</div>

<dev UI_VIEW></dev>
		
	</div>