<template>
	<div id="app">
		<div id="nav">
			<a class="title">订单商城</a>	
				<div class="title1 "><router-link  to="/about">结算界面</router-link></div>
				<div class="title1 " ><router-link  to="/">商品界面</router-link> </div>
				
		</div>
		<router-view />
	</div>
</template>

<style>

	body{
		margin: 0px;
		background-color: #f0f0f0;
	}
	a{
		text-decoration: none;
		color: white;
	}
	.title {
		height: 100px;
		width: 200px;
		margin: 0;
		padding: 0;
		border: 0;
		font-size: 40px;
		float: left;
		text-align: center;/*水平居中*/
		line-height: 100px;/*上下居中*/
	}

	.title1 {
		height: 100px;
		width: 140px;
		float: right;
		text-align: center;
		font-size: 20px;
		line-height: 100px;
	}

	#nav {
		width: 100%;
		height: 100px;
		margin: 0;
		padding: 0;
		border: 0;
		background-color: #40a9ff;
	}
</style>
