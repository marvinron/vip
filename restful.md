#什么是restful

url风格

传统的增删改查

/user/add
/user/update
/user/delete
/user/get?id=1
/user/list

那么在restful url是不允许出现动词  一切都是资源

post /user   添加
put  /user   更新全部
patch /user?name=1 更新某个属性
delete /user/1
get /user/1  查询单个
get /user

