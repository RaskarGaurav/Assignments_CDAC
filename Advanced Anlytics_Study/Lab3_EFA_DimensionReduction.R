#Lab3 EFA
EFA1 <- read_excel("C:/Users/dbda/Desktop/Advance Analytics-2024/Lab-3-Cases/EFA1.xlsx")
attach(EFA1)
str(EFA1)

cor(EFA1)

#EFA
library(psych)
KMO(EFA1)
cortest.bartlett(EFA1)

#PCA & Scree plot
scree(EFA1)
pca(EFA1,nfactors = 10,rotate = F)

#EFA using PCA
z=pca(EFA1,nfactors = 3,method = regression,rotate = "varimax",score = T)
z
print(z$loadings,digits = 3,cutoff = 0.7)
fa.diagram(z$loadings)
