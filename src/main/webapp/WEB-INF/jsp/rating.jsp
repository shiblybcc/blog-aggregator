<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@ include file="../layout/taglib.jsp"%>
<div class="container">
	<div class="row">

		<div class="box">
			<div id="tabs">
				<ul>
					<li><a href="#tabs-1">Rate</a></li>
					<li><a href="#tabs-2">Comment</a></li>
					<div id="course-title" style="width: 100%">${course.name }</div>
				</ul>
				<div id="tabs-1">
					<div class="row">

						<div class="box rating-cat">
							<div style="float: left;">First Category :</div>
							<div id="jRate" style="float: left;"></div>
							<div id="demo-onchange-value" style="float: left;">Your
								Rating: 1</div>
						</div>
						<div class="box rating-cat">
							<div style="float: left;">First Category :</div>
							<div id="jRate2" style="float: left;"></div>
							<div id="demo-onchange-value2" style="float: left;">Your
								Rating: 1</div>
						</div>
						<div class="box rating-cat">
							<div style="float: left;">First Category :</div>
							<div id="jRate3" style="float: left;"></div>
							<div id="demo-onchange-value3" style="float: left;">Your
								Rating: 1</div>
						</div>
						<div class="box rating-cat">
							<div style="float: left;">First Category :</div>
							<div id="jRate4" style="float: left;"></div>
							<div id="demo-onchange-value4" style="float: left;">Your
								Rating: 1</div>
						</div>
						<div class="box rating-cat">
							<div style="float: left;">First Category :</div>
							<div id="jRate5" style="float: left;"></div>
							<div id="demo-onchange-value5" style="float: left;">Your
								Rating: 1</div>
						</div>
						<div>
							<button type="button" class="btn btn-primary"
								style="margin-left: 15%; margin-top: 20px;" data-toggle="save"
								aria-pressed="false" autocomplete="off">Save</button>
						</div>
					</div>
					<!--tab-1 row -->
				</div>
				<!-- tab-1  -->
				<div id="tabs-2">
					<div id="content">
						<div id="wrapper">
							<div id="steps" style="width: 100%;">
								<form id="formElem" name="formElem" action="" method="post">
									<fieldset class="step">
										<legend>Write your comment</legend>
										<p>
											<label for="commenttitle">Comment Title</label> <input
												id="commentitle" name="commenttitle" />
										</p>
										<p>
											<label for="commentdetails">Comment Details</label>
											<textarea rows="4" cols="50" class="resizable">
</textarea>
										</p>
									</fieldset>
								</form>
							</div>
							<div id="navigation" style="display: none;">
								<ul>
									<li class="selected"><a href="#">Save</a></li>
								</ul>
							</div>
						</div>
					</div>
				</div>
				<!-- 					end tab-2 -->
			</div>
		</div>



	</div>
</div>
<!-- /.container -->
