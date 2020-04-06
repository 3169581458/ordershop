<template>
	<div class="view"> 
		<el-input class="input" v-moled="name_input" placeholder="请输入商品名称"></el-input>
		<el-input class="input" v-moled="price_input" type="number" placeholder="请输入商品价格"></el-input>
		<el-input class="input" v-moled="number_input" type="number" placeholder="请输入商品数量"></el-input>
		<el-button class="button" type="success" round>提交订单</el-button>
	</div>
</template>

<script>
	export default {
	  data() {
	    return {
	      name_input: '',
		  price_input:'',
		  number_input:''
	    }
	  }
	}
</script>

<style>
	.input{
		margin-top: 30px;
		font-size: 30px;
		
	}
	.button{
		margin-top: 50px;
		float: right;
		margin-right: 50px;
	}
</style>
