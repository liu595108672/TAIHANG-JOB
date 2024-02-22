# TAIHANG-JOB

## Introduction

TAIHANG-JOB 是从XXL-JOB项目fork而来。由我个人维护，增加了一部分新特性。


## 更新记录

### 2024-02-18 

- 增加 JobTpiController ，用于承接其他服务队定时任务的请求。【单一职责】
  - [X] 修改指定任务的Cron表达式  
  - [ ] 创建新任务
  - [ ] 开启、停止任务