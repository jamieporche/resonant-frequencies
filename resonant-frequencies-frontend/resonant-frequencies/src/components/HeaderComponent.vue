<template>
	<div class="header-container">
		<div id="home">
			<!-- <img src="../assets/home.png" alt="home"> -->
			<div id="name">Resonant Frequencies</div>
		</div>
	</div>
</template>

<script>
export default {
	name: "header-component",
};
</script>

<style scoped>
@import url('https://fonts.googleapis.com/css2?family=Indie+Flower&display=swap');
.header-container {
	border: none;
	display: flex;
	background-color: #0d0b0e;
	opacity: 50%;
}
#home {
	display: flex;
	align-items: center;
	padding: 20px 20px 20px 20px;
}
#home img {
	filter: opacity(.3) drop-shadow(0 0 0 #ccb8fa);
	width: 40px;
	height: auto;
}
#name {
	color: #ccb8fa;
	font-family: "Indie Flower", cursive;
	font-weight: 400;
	font-style: normal;
	font-size: 40px;
	padding-left: 20px;
}
</style>