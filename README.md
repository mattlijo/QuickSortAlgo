{\rtf1\ansi\ansicpg1252\cocoartf1561\cocoasubrtf400
{\fonttbl\f0\fnil\fcharset0 HelveticaNeue;\f1\fnil\fcharset0 Menlo-Regular;}
{\colortbl;\red255\green255\blue255;\red27\green31\blue34;\red255\green255\blue255;\red21\green23\blue26;
\red10\green77\blue204;\red244\green246\blue249;\red27\green31\blue34;}
{\*\expandedcolortbl;;\cssrgb\c14118\c16078\c18039;\cssrgb\c100000\c100000\c100000;\cssrgb\c10588\c12157\c13725\c4706;
\cssrgb\c1176\c40000\c83922;\cssrgb\c96471\c97255\c98039;\cssrgb\c14118\c16078\c18039;}
\paperw11900\paperh16840\margl1440\margr1440\vieww28600\viewh15240\viewkind0
\deftab720
\pard\pardeftab720\sl600\sa320\partightenfactor0

\f0\b\fs48 \cf2 \cb3 \expnd0\expndtw0\kerning0
\outl0\strokewidth0 \strokec2 QuickSort\
\pard\pardeftab720\sl360\sa320\partightenfactor0

\b0\fs32 \cf2 QuickSort is a sorting algorithm developed by Tony Hoare that, on average, makes O(n log n) comparisons to sort n items. It is also known as partition-exchange sort because of its use of the\'a0
\f1\fs27\fsmilli13600 \cb4 partition
\f0\fs32 \cb3 \'a0algorithm. In the worst case, it makes O(n2) comparisons, though this behaviour is rare. QuickSort is often faster in practice than other O(n log n) algorithms.\
\pard\pardeftab720\sl360\partightenfactor0

\b\fs36 \cf5 \cb1 \strokec5 \
\pard\pardeftab720\sl440\sa320\partightenfactor0
\cf2 \cb3 \strokec2 Partition Algorithm\
\pard\pardeftab720\sl360\sa320\partightenfactor0

\b0\fs32 \cf2 We know that QuickSort relies on partitioning as a key step in its algorithm, but what does that really mean? 
\f1\fs27\fsmilli13600 \cb6 \

\f0\fs32 \cb3 Once you've read the annotated code for\'a0
\f1\fs27\fsmilli13600 \cb4 partition
\f0\fs32 \cb3 \'a0it's relatively easy to see what it's doing. Given an array and a pivot point, the algorithm swaps elements in the array such that all elements in the array that are less than the original pivot value come before it and all elements that are greater than the original pivot value come after it.\
There are a couple different ways to implement partitioning. The implementation provided above is your teacher's favourite because it's performed in place (does not require another array) and requires only O(log n) space.\
\pard\pardeftab720\sl360\sa320\partightenfactor0
\cf7 \cb3 \outl0\strokewidth0 \
1) Quicksort with middle pivot\
\
2) Quicksort with last entry as pivot.\
	2.1) Ascending order\
	2.2) Descending order\
}