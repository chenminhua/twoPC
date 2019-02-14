# twoPC
两阶段提交demo

当有数据变更请求时，先由协调者向所有member发送prepare请求，如果有member无法执行则此次写请求直接失败。

如果所有member都通过了prepare阶段并返回给协调者，则协调者向所有成员发送commit请求。

如果所有成员都commit成功，则此次写请求成功。如果出错则全部回退。

## 星巴克不是两阶段提交
[论文](https://www.enterpriseintegrationpatterns.com/docs/IEEE_Software_Design_2PC.pdf)

如果星巴克是两阶段提交的话，顾客就需要拿着钱和订单条在柜台等着，然后等到咖啡完成。然后一手交钱一手交货。
