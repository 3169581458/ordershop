<template>
	<div class="about">
		<div style="margin-top: 15px;">
			<el-input placeholder="请输入内容" v-model="search">
				<el-button slot="append" icon="el-icon-search">搜索</el-button>
			</el-input>
		</div>
		<el-table :data="tableData" stripe style="width: 100%">
			<el-table-column prop="goods_name" label="商品名称" width="180" align='center'>
			</el-table-column>

			<el-table-column prop="goods_price" label="价格" width="180" align='center'>
			</el-table-column>

			<el-table-column prop="goods_num" label="数量" width="180" align='center'>
<!-- 				<template slot-scope="scope1">
					<el-input-number v-model="num" controls-position="right" @change="numberchange" :min="1" :max="10"></el-input-number>
				</template> -->
			</el-table-column>

			<el-table-column label="操作" align="center">
				
				<template slot-scope="scope">
					<el-button icon="el-icon-remove-outline" cirle></el-button>
					<el-button icon="el-icon-circle-plus-outline" cirle></el-button>
					<el-button icon="el-icon-delete" @click="handleDelete(scope.$index,scope.row)"></el-button>
				</template>
			</el-table-column>
		</el-table>
		<el-button @click="drawer = true" class="drawer">
			结算
		</el-button>

		<el-drawer title="我是标题" :visible.sync="drawer" :with-header="false" :direction="direction">
			<span class="el-icon-shopping-cart-full" style="font-size: 38px;">:</span>
		</el-drawer>
	</div>
</template>
<style>
	.drawer {
		float: right;
		margin-right: 50px;
		margin-top: 20px;
		height: 50px;
		width: 88px;
		border-radius: 50px 50px 50px 50px;
	}
</style>

<script>
	export default {
		data() {
			return {
				tableData: [{
						goods_name: '苹果',
						goods_price: '5',
						goods_num: '7'
					}
				],
				drawer: false,
				direction: 'btt',
				
			}
		},
		methods: {
			handleDelete(index, row) {
				console.log(index, row);
			},
			numberChange(value) {
				console.log(value);
			}
		},
		created(){
			const _this=this
			        this.$axios.get('http://localhost:8889/orderlist/findAll',{
			           
			          })
			          .then(resp => {
			            _this.tableData=resp.data
			          }).catch(err => {
			            console.log(err);
			          })
					  
		}
	}
</script>





<!-- <template>
    <div>
        <el-table
            :data="tableDates"
            size="small"
            border
            empty-text="暂无数据"
            style="width: 100%">
            <el-table-column
                prop="itemCode"
                label="物料编码"
                show-overflow-tooltip
                width="auto"
                align="center">
                    <template slot-scope="scope">
                    <el-input
                        v-model="scope.row.itemCode"
                        type="text"
                        placeholder="物料名称"
                    ></el-input>
                </template>
            </el-table-column>
            <el-table-column
                prop="itemName"
                label="物料名称"
                width="auto"
                align="center">
                <template slot-scope="scope">
                    <el-input
                        v-model="scope.row.itemName"
                        type="text"
                        placeholder="物料名称"
                    ></el-input>
                </template>
            </el-table-column>
            <el-table-column
                prop="norms"
                label="型号"
                width="auto"
                align="center">
                <template slot-scope="scope">
                    <el-input
                        v-model="scope.row.norms"
                        type="text"
                        placeholder="型号"
                    ></el-input>
                </template>
            </el-table-column>
            <el-table-column
                prop="unit"
                label="单位"
                width="auto"
                align="center">
                <template slot-scope="scope">
                    <el-input
                        v-model="scope.row.unit"
                        type="text"
                        placeholder="单位"
                    ></el-input>
                </template>
            </el-table-column>
            <el-table-column
                prop="outSum"
                label="退料数量"
                width="auto"
                align="center">
                    <template slot-scope="scope">
                    <el-input
                        type="number"
                        v-model="scope.row.outSum"
                        placeholder="退料数量"
                    ></el-input>
                </template>
            </el-table-column>
            <el-table-column
                prop="reason"
                label="退料原因"
                show-overflow-tooltip
                width="auto"
                align="center">
                    <template slot-scope="scope">
                    <el-input
                        v-model="scope.row.reason"
                        type="text"
                        placeholder="退料原因"
                    ></el-input>
                </template>
            </el-table-column>
            <el-table-column
                prop="remarks"
                label="备注"
                width="auto"
                align="center">
                <template slot-scope="scope">
                    <el-input
                        v-model="scope.row.remarks"
                        type="text"
                        placeholder="备注"
                    ></el-input>
                </template>
            </el-table-column>
            <el-table-column
                label="操作"
                width="160"
                align="center">
                <template slot-scope="scope">
                    <el-button
                        size="mini"
                        type="danger"
                        plain
                        @click.native="delRow(scope.$index,tableDates)"
                        title="删除">删除
                    </el-button>
                </template>
            </el-table-column>
        </el-table>
        <el-button type="primary"  @click.native="addRow" class="mt-3" size="small" icon="el-icon-plus">新 增</el-button>
        <el-button type="success"  @click.native="submitForm" class="mt-3" size="small">确 定</el-button>
    </div>
</template>
 
<script>
 
    export default {
        data() {
            return {
               tableDates:[],
            };
        },
		components: {
		},
        methods: {
            //数据的新增
            addRow(){
                 let j = {
                    itemCode: "",
                    itemName: "",
                    norms: "",
                    unit: "",
                    outSum: "",
                    reason: "",
                    remarks: "",
                    inventoryId:'',
                };
                this.tableDates.push(j);
            },
            // 数据的删除
            delRow(index,rows){
                rows.splice(index, 1)
            },
            //保存
            submitForm() {
                let _this = this;
                let data = {
                    list: _this.tableDates,
                }
                console.log(data)
            },
        },
        mounted() {
           
        },
    }
</script>
 
<style lang="scss" scoped>
</style>

 -->
