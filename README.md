# zfarm
抽象后台开发中的常用套路，提供前后台的封装，从而实现快速跌代开发


## 实现目标：

1. 后台提供统一的API规范，包括：结构定义（包括表格、form等)、CRUD接口、导入导出
2. 后台支持表关联、校验规则等
3. 前台根据结构定义，生成表格展示(分页与不分页)，以及按钮，支持查询、查看、新增、修改、删除数据等操作
4. 前台根据结构定义，自动生成图表（支持echart,g2等定义格式）
5. 采用前后端分离方案，支持vue+ant-design-vue

## JAVA后端技术栈
1. springboot
2. mybatis-plus
3. h2

## 前端技术栈
1. vue vuex vue-router，基于vue-cli3
2. ant-design-vue