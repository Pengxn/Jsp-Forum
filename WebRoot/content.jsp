<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<section class="content">

	<div class="paginationforum"></div><!-- 使header与content保持间距 -->

	<div class="container">
		<div class="row">
		
			<!-- post nav -->
			<div class="col-lg-8 col-md-8">
			
			
				<!-- POST -->
				<div class="post">
					<div class="wrap-ut pull-left">
						<div class="userinfo pull-left">
							<div class="avatar">
								<img src="images/avatar.jpg" alt="" />	<!-- avatar -->
								<div class="status green">&nbsp;</div>	<!-- status dot -->
							</div>
							<div class="icons">
								<img src="images/icon1.jpg" alt="" /><img src="images/icon2.jpg" alt="" />
								<img src="images/icon3.jpg" alt="" /><img src="images/icon4.jpg" alt="" />
							</div>
						</div>
						<div class="posttext pull-left">
							<h2>
								<a href="02_topic.html">10 Kids Unaware of Their Halloween Costume</a><!-- Post title -->
							</h2>
							<p>
								It's one thing to subject yourself to a Halloween costume mishap because, hey, that's your prerogative.<!-- Post Content Summary -->
							</p>
						</div>
						<div class="clearfix"></div>
					</div>
					<div class="postinfo pull-left">
						<div class="comments">
							<div class="commentbg">
								560	<!-- Comment Number -->
								<div class="mark"></div>
							</div>
						</div>
						<div class="views">
							<i class="fa fa-eye"></i>
							1,568 <!-- Viewed Number -->
						</div>
						<div class="time">
							<i class="fa fa-clock-o"></i>
							24 min	<!-- Post Time -->
						</div>
					</div>
					<div class="clearfix"></div>
				</div><!-- POST END -->
				
			
			</div><!-- Post Nav END -->
			
			<!-- Right Side Nav -->
			<div class="col-lg-4 col-md-4">
			
				<!-- category nav -->
				<jsp:include page="category.jsp"></jsp:include>
				
				<!-- Poll of Week Nav -->
				<jsp:include page="poll.jsp"></jsp:include>
				
				<!-- Active Threads Nav -->
				<jsp:include page="active.jsp"></jsp:include>
			
			</div><!-- Right Side Nav END -->
		
		</div>
	</div>

	<!-- Page Number -->
	<div class="container">
		<div class="row">
			<div class="col-lg-8 col-xs-12">
				<div class="pull-left">
					<a href="#" class="prevnext">
						<i class="fa fa-angle-left"></i><!-- 上一页 -->
					</a>
				</div>
				<div class="pull-left">
					<ul class="paginationforum">
						<li class="hidden-xs"><a href="#">1</a></li>
						<li class="hidden-xs"><a href="#">2</a></li>
						<li class="hidden-xs"><a href="#">3</a></li>
						<li class="hidden-xs"><a href="#">4</a></li>
						<li><a href="#">5</a></li>
						<li><a href="#">6</a></li>
						<li><a href="#" class="active">7</a></li>
						<li><a href="#">8</a></li>
						<li class="hidden-xs"><a href="#">9</a></li>
						<li class="hidden-xs"><a href="#">10</a></li>
						<li class="hidden-xs hidden-md"><a href="#">11</a></li>
						<li class="hidden-xs hidden-md"><a href="#">12</a></li>
						<li class="hidden-xs hidden-sm hidden-md"><a href="#">13</a></li>
						<li><a href="#">1586</a></li>
					</ul>
				</div>
				<div class="pull-left">
					<a href="#" class="prevnext last">
						<i class="fa fa-angle-right"></i><!-- 下一页 -->
					</a>
				</div>
				<div class="clearfix"></div>
			</div>
		</div>
	</div><!-- Page Number END -->
                
</section>