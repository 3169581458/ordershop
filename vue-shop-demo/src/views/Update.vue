<template>
	<div>
		<el-form style="width: 50%;" :model="ruleForm" status-icon :rules="rules" ref="ruleForm" label-width="100px" class="demo-ruleForm">
			
			
			    <el-form-item label="订单编号" prop="goods_id">
				<el-input v-model="ruleForm.goods_id" autocomplete="off"></el-input>
</el-form-item>
				<el-form-item label="商品名称" prop="goods_name">
					<el-input v-model="ruleForm.goods_name" autocomplete="off"></el-input>
				</el-form-item>
				<el-form-item label="商品价格" prop="goods_price">
					<el-input v-model="ruleForm.goods_price" autocomplete="off"></el-input>
				</el-form-item>
				<el-form-item label="商品数量" prop="goods_num">
					<el-input v-model="ruleForm.goods_num"></el-input>
				</el-form-item>
				<el-form-item>
					<el-button type="primary" @click="submitForm('ruleForm')">修改</el-button>
					<el-button @click="resetForm('ruleForm')">重置</el-button>
				</el-form-item>
		</el-form>
	</div>
</template>

<script>
	export default {
		data() {
			return {
				ruleForm: {
					goods_id: '',
					goods_name: '',
					goods_price: '',
					goods_num: ''
				},
				rules: {
					goods_name: [
						//定义规则（校验） 必填项 提示信息 触发事件
						{
							required: true,
							message: '请输入商品名称',
							trigger: 'goods_name'
						}
					],
					goods_price: [{
						required: true,
						message: '请输入商品价格',
						trigger: 'goods_price'
					}],
					goods_num: [{
						required: true,
						message: '请输入商品数量',
						trigger: 'goods_num'
					}]
				}
			};
		},
		methods: {
			//提交
			submitForm(formName) {
				//_this表示当前vue对象
				const _this = this;
				this.$refs[formName].validate((valid) => {
					if (valid) {
						this.$axios.post('http://localhost:8889/orderlist/update', this.ruleForm).then(resp => {
							if (resp.data == 'success') {
								alert('商品修改成功')
								_this.$router.push('/About')
							}
						})
					} else {
						return false;
					}
				});
			},
			//重置
			resetForm(formName) {
				this.$refs[formName].resetFields();
			}
		},
		created() {
			const _this = this;
			this.axios.get('http://localhost:8889/orderlist/findById/' + this.$route.query.id).then(resp => {
				_this.ruleForm = resp.data
			})
		}
	}
</script>

<style>
</style>
