select
    所蔵品目.所蔵品目番号 as entryNumber
   ,所蔵品目.タイトル     as title
   ,所蔵品目.著者        as workOf
   ,所蔵品目.所蔵品目種別  as entryType
   ,(
     select
        count(*)
     from
        貸出可能
     inner join 所蔵品
        on 貸出可能.所蔵品番号 = 所蔵品.所蔵品番号
     where
        所蔵品.所蔵品目番号 = 所蔵品.所蔵品目番号
   )                    as stockQuantity
from
    所蔵品目
where
    所蔵品目.タイトル like /* @infix(keyword.value) */'オブジェクト'
or 所蔵品目.著者 like /* @infix(keyword.value) */'エリック'
order by 所蔵品目.所蔵品目番号