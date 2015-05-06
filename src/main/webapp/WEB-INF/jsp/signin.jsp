<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="../layout/taglib.jsp"%>

<div class="container">
	<div class="row">

		<div id="content" style="width: 50%;">
			<div id="wrapper" style="width: 100%;">
				<div id="steps" style="width: 100%;">
					<form id="formElem" name="formElem" action="" method="post">
						<fieldset class="step" style="width: 100%;">
							<legend>Sign in</legend>
							<p>
								<label for="username">User name</label> <input id="username"
									name="username" style="width: 50%;" />
							</p>
							<p>
								<label for="password">Password</label> <input id="password"
									name="password" type="password" AUTOCOMPLETE=OFF
									style="width: 50%;" />
							</p>
						</fieldset>
					</form>
				</div>
				<div id="navigation" style="display: none;">
					<ul>
						<li class="selected"><a href="#">Account</a></li>
					</ul>
				</div>
			</div>
		</div>


	</div>
</div>
<!-- /.container -->