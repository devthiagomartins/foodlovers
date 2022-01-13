INSERT INTO tb_user(email) VALUES ('maria@gmail.com');
INSERT INTO tb_user(email) VALUES ('joao@gmail.com');
INSERT INTO tb_user(email) VALUES ('ana@gmail.com');
INSERT INTO tb_user(email) VALUES ('lucia@gmail.com');
INSERT INTO tb_user(email) VALUES ('joaquim@gmail.com');

INSERT INTO tb_food(score, count, title, image) VALUES (4.5, 2, 'Pizza de calabresa', 'https://img.itdg.com.br/tdg/images/blog/uploads/2019/05/pizza.jpg');
INSERT INTO tb_food(score, count, title, image) VALUES (3.3, 3, 'Pizza Margherita', 'https://st.depositphotos.com/1900347/4146/i/600/depositphotos_41466555-stock-photo-image-of-slice-of-pizza.jpg');
INSERT INTO tb_food(score, count, title, image) VALUES (0, 0, 'Pizza à Moda da casa', 'http://padarianutrivida.com.br/web/image/product.template/3445/image_1024?unique=ac1be23');
INSERT INTO tb_food(score, count, title, image) VALUES (0, 0, 'Pizza de Frango com Catupiry', 'https://1.bp.blogspot.com/-gRfMucZJUVU/YIhFTgd8Q_I/AAAAAAAAAIA/yclXuWhWL5IZ15vZdr_1CA8mmpUEI16jQCLcBGAsYHQ/s1500/vSlruWLdJ5Ndj72oyDSNDH6DjPajbxhtEEifteHF.png');
INSERT INTO tb_food(score, count, title, image) VALUES (0, 0, 'Pizza Napolitana', 'https://blog.livup.com.br/wp-content/uploads/2021/06/pizza-napolitana.jpg');
INSERT INTO tb_food(score, count, title, image) VALUES (0, 0, 'Pizza 4 Queijos', 'https://a-static.mlcdn.com.br/1500x1500/pizza-quatro-queijos-saborosa-e-caprichada/restauranteepizzariasensacao/4bb3c9cabdbc11eba9914201ac18500e/96f65996c30f06ea148ebcae9b0c7f54.jpg');
INSERT INTO tb_food(score, count, title, image) VALUES (0, 0, 'Pizza Portuguesa', 'https://www.sabornamesa.com.br/media/k2/items/cache/6eb4b1a8ed68214ae7a4c86692674e4d_XL.jpg');
INSERT INTO tb_food(score, count, title, image) VALUES (0, 0, 'Pizza Baiana', 'https://www.receiteria.com.br/wp-content/uploads/receitas-de-pizza-baiana-2.jpg');
INSERT INTO tb_food(score, count, title, image) VALUES (0, 0, 'Pizza Vegetariana', 'https://www.rbsdirect.com.br/filestore/3/5/5/9/1_51efc0ec876023c/19553_64093619698d8da.jpg?w=700');
INSERT INTO tb_food(score, count, title, image) VALUES (0, 0, 'Pizza de Presunto e Queijo', 'https://2.bp.blogspot.com/-l3bwiYlfle4/VzPcH8PZ4sI/AAAAAAAAS6Y/vCaS3NPhdCYMPGgGfw6bAyjoOdXHpxJoQCLcB/s1600/pizza-de-liquidificador-em-trinta-minutos.jpg');


INSERT INTO tb_score(food_id, user_id, value) VALUES (1, 1, 5.0);
INSERT INTO tb_score(food_id, user_id, value) VALUES (1, 2, 4.0);
INSERT INTO tb_score(food_id, user_id, value) VALUES (2, 1, 3.0);
INSERT INTO tb_score(food_id, user_id, value) VALUES (2, 2, 3.0);
INSERT INTO tb_score(food_id, user_id, value) VALUES (2, 3, 4.0);