## ソート処理

♯## 処理速度
- 100バイト（100文字）×20項目×1000行のデータを3項目でのソートに65～70ms程度
- 20バイト（20文字）×20項目×1000行のデータを3項目でのソートに65～70ms程度
  - →項目の桁数はあまり関係ない。

- 20バイト（20文字）×20項目×2000行のデータを3項目でのソートに90～95ms程度
- 20バイト（20文字）×20項目×3000行のデータを3項目でのソートに115～120ms程度
- 20バイト（20文字）×20項目×4000行のデータを3項目でのソートに130～135ms程度
- 20バイト（20文字）×20項目×5000行のデータを3項目でのソートに140～145ms程度
- 20バイト（20文字）×20項目×6000行のデータを3項目でのソートに170～175ms程度
- 20バイト（20文字）×20項目×6000行のデータを3項目でのソートに250～255ms程度
  - O(nlogn)に従い速度低下。