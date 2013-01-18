/*操作信贷数据库*/
/*sdic.data*/
select * from s_dic
/*cuscom.data*/
SELECT W.CUS_ID,W.CUS_NAME FROM CUS_COM W WHERE W.CUS_STATUS='20'  AND W.CUS_NAME LIKE '%$a%'