# twoPC
两阶段提交demo

当有数据变更请求时，先由协调者向所有member发送prepare请求，如果有member无法执行则此次写请求直接失败。

如果所有member都通过了prepare阶段并返回给协调者，则协调者向所有成员发送commit请求。

如果所有成员都commit成功，则此次写请求成功。如果出错则全部回退。
