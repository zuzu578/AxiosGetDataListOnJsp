{\rtf1\ansi\ansicpg949\cocoartf2580
\cocoatextscaling0\cocoaplatform0{\fonttbl\f0\fnil\fcharset0 Menlo-Regular;\f1\fnil\fcharset0 Menlo-Italic;\f2\fnil\fcharset0 Menlo-BoldItalic;
}
{\colortbl;\red255\green255\blue255;\red217\green232\blue247;\red160\green160\blue160;\red249\green250\blue244;
\red23\green198\blue163;\red204\green108\blue29;\red18\green144\blue195;\red30\green181\blue64;\red128\green242\blue246;
\red121\green171\blue255;\red230\green230\blue250;\red141\green218\blue248;\red167\green236\blue33;\red177\green102\blue218;
\red242\green242\blue0;\red102\green225\blue248;\red128\green246\blue167;\red243\green236\blue121;}
{\*\expandedcolortbl;;\csgenericrgb\c85098\c90980\c96863;\csgenericrgb\c62745\c62745\c62745;\csgenericrgb\c97647\c98039\c95686;
\csgenericrgb\c9020\c77647\c63922;\csgenericrgb\c80000\c42353\c11373;\csgenericrgb\c7059\c56471\c76471;\csgenericrgb\c11765\c70980\c25098;\csgenericrgb\c50196\c94902\c96471;
\csgenericrgb\c47451\c67059\c100000;\csgenericrgb\c90196\c90196\c98039;\csgenericrgb\c55294\c85490\c97255;\csgenericrgb\c65490\c92549\c12941;\csgenericrgb\c69412\c40000\c85490;
\csgenericrgb\c94902\c94902\c0;\csgenericrgb\c40000\c88235\c97255;\csgenericrgb\c50196\c96471\c65490;\csgenericrgb\c95294\c92549\c47451;}
\paperw11900\paperh16840\margl1440\margr1440\vieww11520\viewh8400\viewkind0
\deftab720
\pard\pardeftab720\partightenfactor0

\f0\fs24 \cf2 	
\f1\i \cf3 @RequestMapping
\f0\i0 \cf4 (\cf5 "boardList"\cf4 )\cf0 \
\cf2 	\cf6 public\cf2  \cf7 String\cf2  \cf8 boardList\cf4 (\cf9 HttpServletRequest\cf2  \cf10 req\cf2  \cf11 ,\cf2  \cf9 Model\cf2  \cf10 model\cf4 )\cf2  \cf4 \{\cf0 \
\cf2 		\cf0 \
\cf2 		\cf7 System\cf11 .
\f2\i\b \cf12 out
\f0\i0\b0 \cf11 .\cf13 println\cf4 (\cf5 "test"\cf4 )\cf11 ;\cf0 \
\cf2 		\cf6 return\cf2  \cf5 "test"\cf11 ;\cf0 \
\cf2 	\cf4 \}\cf0 \
\cf2 	\cf0 \
\cf2 	
\f1\i \cf3 @RequestMapping
\f0\i0 \cf4 (\cf5 "/getTestData"\cf4 )\cf0 \
\cf2 	
\f1\i \cf3 @ResponseBody
\f0\i0 \cf0 \
\cf2 	\cf6 public\cf2  \cf9 List\cf11 <\cf14 Dto\cf11 >\cf2  \cf8 getTestData\cf4 (\cf9 HttpServletRequest\cf2  \cf10 req\cf4 )\cf2  \cf4 \{\cf0 \
\cf2 		\cf9 Dao\cf2  \cf15 dao\cf2  \cf11 =\cf2  \cf16 sqlSession\cf11 .\cf17 getMapper\cf4 (\cf9 Dao\cf11 .\cf6 class\cf4 )\cf11 ;\cf0 \
\cf2 		\cf9 List\cf11 <\cf14 Dto\cf11 >\cf2  \cf15 dtos\cf2  \cf11 =\cf2  \cf18 dao\cf11 .\cf17 BoardList\cf4 ()\cf11 ;\cf0 \
\cf2 		\cf0 \
\cf2 		\cf7 System\cf11 .
\f2\i\b \cf12 out
\f0\i0\b0 \cf11 .\cf13 println\cf4 (\cf5 "getTestData() called! "\cf4 )\cf11 ;\cf0 \
\cf2 		\cf0 \
\cf2 		\cf6 return\cf2  \cf18 dtos\cf11 ;\cf0 \
\cf2 		\cf0 \
\cf2 	\cf4 \}}