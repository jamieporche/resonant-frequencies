<template>
	<div class="footer-container">
		<div class="footer-container">
			<h1 id="tagline">Voyage into your resonant frequencies</h1>
		</div>
		<div id="logo">
			<router-link v-bind:to="{ name: 'home' }">
				<img src="../assets/resonant-logo.png" alt="rf-logo" />
			</router-link>
		</div>
	</div>
</template>

<script>
export default {
  name: "footer-component",
};
</script>

<style scoped>
@import url('https://fonts.googleapis.com/css2?family=Indie+Flower&display=swap');
.footer-container {
	border: none;
	display: flex;
	justify-content: flex-end;
	background-color: #0d0b0e;
	opacity: 50%;
}

#logo img {
    width: 40px;
    height: auto;
    padding: 20px 20px 20px 20px;
}

#tagline {
	color: #ccb8fa;
	font-family: "Indie Flower", cursive;
	font-weight: 400;
	font-style: normal;
	font-size: 30px;
}
</style>